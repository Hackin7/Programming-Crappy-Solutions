.class public final Leq;
.super Lev;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leq$a;
    }
.end annotation


# static fields
.field private static a:Leq$a;


# direct methods
.method public static a()Leq$a;
    .locals 1

    sget-object v0, Leq;->a:Leq$a;

    return-object v0
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

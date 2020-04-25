.class public final Liz;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Liz$a;
    }
.end annotation


# instance fields
.field public final a:Liz$a;

.field public final b:Lja;


# direct methods
.method public constructor <init>(Lja;Liz$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Liz;->a:Liz$a;

    iput-object p1, p0, Liz;->b:Lja;

    return-void
.end method

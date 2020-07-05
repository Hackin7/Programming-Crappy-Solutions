.class public final Lez$b;
.super Ljava/lang/Object;

# interfaces
.implements Lez$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lez;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:[Lez$c;


# direct methods
.method public constructor <init>([Lez$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lez$b;->a:[Lez$c;

    return-void
.end method

.class final Ljd$c$1;
.super Ljava/lang/Object;

# interfaces
.implements Liz$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljd$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Liy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Liy;",
            ">()TT;"
        }
    .end annotation

    new-instance v0, Ljd$c;

    invoke-direct {v0}, Ljd$c;-><init>()V

    return-object v0
.end method
